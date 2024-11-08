# config/routes.rb
Rails.application.routes.draw do
  get 'users', to: 'users#index'
end

# app/controllers/users_controller.rb
class UsersController < ApplicationController
  def index
    # Vulnerable code
    @users = User.where("name = '#{params[:name]}'")
    render json: @users
  end
end
